import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { TaskServiceService } from 'src/app/Service/task-service.service';
import { Task } from 'src/app/Model/Task';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {

  tasks:Task[];
  constructor(private http:TaskServiceService, private router:Router) { }

  ngOnInit() {
    this.http.getTasks().subscribe(data=>{
      this.tasks = data;

    });
  }

  updateTask(task:Task){
    localStorage.setItem("idSelectedTask", task.id.toString());
    this.router.navigate(['updateTask']);
  }

}
