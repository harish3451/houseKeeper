import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LogInComponent as adminLogIn } from './admin/log-in/log-in.component';
import { RegisterComponent as adminRegister } from './admin/register/register.component';

const routes: Routes = [
  {path:'admin',component:adminLogIn, children:[
    {path:'register', component:adminRegister}
  ]}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
 