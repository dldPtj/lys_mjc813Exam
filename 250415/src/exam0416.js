//문제 19
//클래스 한 개 생성
//공백으로 구분하여 두 숫자 a와 b가 주어지면, a의 b승을 구하는 프로그램을 작성하세요.
//class Exam19 {
    let mul = prompt("a와 b를 차례로 입력하세요.").split(' ');
    const a = mul[0];
    const b = mul[1];

    for(let i=1; i<b; i++) {
        mul[0] *= a;
    }
    console.log(mul[0]);
//}

//문제 26
//클래스 한 개 생성
const planet = ["Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"];
