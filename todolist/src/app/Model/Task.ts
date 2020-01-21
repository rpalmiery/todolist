import { Developer } from './Developer';

export class Task {
    id: number;
    title: String;
    description: String;
    estimateTime: number;
    workedTime: number;
    developer:Developer;
}