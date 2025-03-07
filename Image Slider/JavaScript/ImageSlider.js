const imgUrlsArr = [
    "../Static/Images/water.jpg",
    "../Static/Images/animal.jpg",
    "../Static/Images/butterfly.jpg",
    "../Static/Images/bird.jpg"
];

const articleContainer = document.getElementById("article-container");
let imgIndex = 0;

function renderImage() {
    articleContainer.innerHTML = `<img src="${imgUrlsArr[imgIndex]}" class="image" />`;
}

renderImage();

function previousImg() {
    imgIndex = (imgIndex > 0) ? imgIndex - 1 : imgUrlsArr.length - 1;
    renderImage();
}

function nextImg() {
    imgIndex = (imgIndex < imgUrlsArr.length - 1) ? imgIndex + 1 : 0;
    renderImage();
}