import './button1.scss';

class ButtonComponent {
    render() {
        const button = document.createElement('button');
        button.classList.add('buttonColor');
        button.innerHTML = '버튼1';

        const body = document.querySelector('body');
        body.appendChild(button);
    }
}

export default ButtonComponent;