import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { TaskServiceService } from 'src/app/Service/task-service.service';
import { Task } from 'src/app/Model/Task';
import { Developer } from 'src/app/Model/Developer';
import { DeveloperServiceService } from 'src/app/Service/developer-service.service';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {

  constructor(private router:Router, private taskService:TaskServiceService, private developerService: DeveloperServiceService) { }

  task:Task;
  developers:Developer[];
  devSelected:number;
  developer:Developer;

  ngOnInit() {
    this.task = new Task();
    this.developerService.getDevelopers().subscribe(data=>{
      this.developers = data;
      console.log('Tasks: ' + this.developers);
    });
  }

  persistTask(){
    if (this.devSelected>0){
       this.task.developer=<Developer>{ id: +this.devSelected };
    }
    
    this.taskService.saveTask(this.task).subscribe(data=>{
      alert("Task saved sucess!");
      this.router.navigate(["listTasks"]);
    });
  }

}
