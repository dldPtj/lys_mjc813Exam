import Header from './header.png';

function addImage() {
    const img = document.createElement('img');
    
    img.src=Header;
    img.alt='이미지 불러오기 실패';

    const body = document.querySelector('body');
    body.appendChild(img);
}

export default addImage;