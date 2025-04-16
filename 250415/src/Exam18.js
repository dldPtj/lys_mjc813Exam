const score = prompt("국어, 수학, 영어 시험 점수를 순서대로 입력하세요.").split(' ');

let total = 0;
for(let i=0; i<3; i++) {
    total += parseInt(score[i]);
}

let total_avg = Math.floor(total / 3); //random 함수만 0.0000~0.9999
console.log(total_avg);