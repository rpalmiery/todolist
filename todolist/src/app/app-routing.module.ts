import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddComponent } from './Task/add/add.component';
import { ListComponent } from './Task/list/list.component';
import { UpdateComponent } from './Task/update/update.component';


const routes: Routes = [
  {path:'listTasks', component:ListComponent},
  {path:'newTask', component:AddComponent},
  {path:'updateTask', component:UpdateComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
