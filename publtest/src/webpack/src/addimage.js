import imageData from './item-1.png';
import AltText from './altText.txt';

function addImage() {
    const img = document.createElement('img');
    img.src = imageData;
    img.alt=AltText;
    img.width = 200;

    const body = document.querySelector('body');
    body.appendChild(img);
}

export default addImage;