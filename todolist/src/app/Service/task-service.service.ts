import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Task } from '../Model/Task';

@Injectable({
  providedIn: 'root'
})
export class TaskServiceService {

  constructor(private http: HttpClient) { }

  Url = 'http://localhost:8080/Tasks/';

  getTasks() {
    return this.http.get<Task[]>(this.Url);
  }

  getTask(taskId:String) {
    return this.http.get<Task>(this.Url+taskId);
  }

  saveTask(task: Task) {
    return this.http.post<Task>(this.Url, task);
  }
}
