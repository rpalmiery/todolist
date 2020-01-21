import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Developer } from '../Model/Developer';

@Injectable({
  providedIn: 'root'
})
export class DeveloperServiceService {
  Url = 'http://localhost:8080/Developers/';

  constructor(private http: HttpClient) { }

  getDevelopers() {
    return this.http.get<Developer[]>(this.Url);
  }
}
