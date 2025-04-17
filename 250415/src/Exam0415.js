//문제 9
let year = '2019';
let month = '04';
let day = '26';
let hour = '11';
let minute = '34';
let second = '27';

let result = year.concat("/", month.concat("/", day.concat(" ", hour.concat(":", minute.concat(":", second.concat())))));

console.log(result);


//출력
//2019/04/26 11:34:27

//문제 10
//let nSpace = 4;
//let nStar = 1;
//for( let nLine=0; nLine<5; nLine++ ){
//    let strLine = "";
//    for( let nSp = 0; nSp < nSpace; nSp++ ) {
//        strLine += " ";
//    }
//    for( let nSt = 0; nSt < nStar; nSt++ ) {
//        strLine +="*";
//    }
//    console.log(strLine);
//    nSpace--;
//    nStar += 2;
//}

const n = prompt(`숫자를 입력하세요.`);
let tree = '';

for(let i=1; i<=n; i++) {
    let star='';
    for(let j=1; j<=n-i; j++){
        star += ' ';
    }
    for(let k=1; k<=2*i-1; k++){
        star += '*';
    }
    tree += star +'\n';
}
console.log(tree);

//문제 17

    let height = prompt("키를 입력하세요.");

    if(height>=150){
        console.log(`Yes`);
    } else
        console.log(`No`);


//let exam17 = new Height();
//exam17.Height();

//문제 18
const score = prompt("국어, 수학, 영어 시험 점수를 순서대로 입력하세요.").split(' ');

let total = 0;
for(let i=0; i<3; i++) {
    total += parseInt(score[i]);
}

let total_avg = Math.floor(total / 3); //random 함수만 0.0000~0.9999
console.log(total_avg);
