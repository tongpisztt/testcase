import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { MatButtonModule, MatCardModule, MatInputModule, MatListModule, MatToolbarModule } from '@angular/material';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FormsModule } from '@angular/forms';

import { NoopAnimationsModule} from '@angular/platform-browser/animations';
import { MatSelectModule } from '@angular/material/select';
import { Component } from '@angular/core';
import { MatDialogModule} from '@angular/material/dialog';
import { MatFormFieldModule } from '@angular/material/form-field';

import { AppointmentService } from './service/appointment.service';
import { RouterModule, Routes } from '@angular/router';
import { AgentAppointmentComponent } from './agent-appointment/agent-appointment.component';
import { AppRoutingModule } from './/app-routing.module';
import { MatDividerModule } from '@angular/material/divider';
import { ShowAppointmentResultComponent } from './show-appointment-result/show-appointment-result.component';

const appRoutes: Routes = [

];

@Component({

})

@NgModule({
  declarations: [
    AppComponent,
    AgentAppointmentComponent,
    ShowAppointmentResultComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    BrowserAnimationsModule,
    NoopAnimationsModule,
    MatSelectModule,
    MatDialogModule,
    MatFormFieldModule,
    MatButtonModule,
    MatCardModule,
    MatInputModule,
    MatListModule,
    MatToolbarModule,
    MatDividerModule,
    FormsModule,
    RouterModule.forRoot(appRoutes),
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
