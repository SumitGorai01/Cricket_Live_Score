import { Component, OnInit } from '@angular/core';
import { ApiCallService } from '../../services/api-call.service';
import { Console, error, log } from 'console';
import { CommonModule } from '@angular/common';
import { MatchCardComponent } from "../../components/match-card/match-card.component";
import { RouterModule, RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-live',
  standalone: true,
  imports: [CommonModule, MatchCardComponent,RouterModule],
  templateUrl: './live.component.html',
  styleUrl: './live.component.css'
})
export class LiveComponent implements OnInit {

  liveMatches : any;

  constructor(private _api: ApiCallService){}

  ngOnInit(): void {
    this.loadLiveMatches();
  }

  private loadLiveMatches() {
    this._api.getLiveMatches().subscribe({
      next: data => {
        console.log(data);
        this.liveMatches = data

      },
      error: error => {
        console.log(error);
      }
    });
  }
}
