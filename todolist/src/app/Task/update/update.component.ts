import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { TaskServiceService } from 'src/app/Service/task-service.service';
import { DeveloperServiceService } from 'src/app/Service/developer-service.service';
import { Task } from 'src/app/Model/Task';
import { Developer } from 'src/app/Model/Developer';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {

  constructor(private router:Router, private taskService:TaskServiceService, private developerService: DeveloperServiceService) { }

  task:Task;
  developers:Developer[];
  devSelected:number;
  developer:Developer;

  ngOnInit() {
    this.updateTask();
  }

  updateTask(){
    let idSelectedTask = localStorage.getItem("idSelectedTask");
    console.log("Recibe: " + idSelectedTask);
    this.taskService.getTask(idSelectedTask).subscribe(data=>{
      this.task = data;
    });;
  }

  persistTask(){
    this.taskService.saveTask(this.task).subscribe(data=>{
      alert("Task saved sucess!");
      this.router.navigate(["listTasks"]);
    });
  }

}
