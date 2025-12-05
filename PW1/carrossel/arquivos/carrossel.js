const slides = document.getElementById("fotos");
const slideCount = document.querySelectorAll(".foto").length;
const prevBtn = document.getElementById("btDireita");
const nextBtn = document.getElementById("btEsquerda");
const dotsContainer = document.getElementById("pontos");

let index = 0;

for(let i = 0; i < slideCount; i++){
  const dot = document.createElement("div");
  dot.dataset.index = i;
  dot.addEventListener("click", () => goTo(i));
  dotsContainer.appendChild(dot);
}

function updateDots(){
  document.querySelectorAll("#pontos div").forEach((d,i)=>{
    d.classList.toggle("active", i === index);
  });
}

function updateSlide(){
  slides.style.transform = `translateX(${-index * 100}%)`;
  updateDots();
}

function next(){
  index = (index + 1) % slideCount;
  updateSlide();
}

function prev(){
  index = (index - 1 + slideCount) % slideCount;
  updateSlide();
}

prevBtn.onclick = () => { prev(); resetAutoplay(); };
nextBtn.onclick = () => { next(); resetAutoplay(); };

document.getElementById("carrossel").addEventListener("touchstart", (e)=>{
  startX = e.touches[0].clientX;
});

document.getElementById("carrossel").addEventListener("touchend", (e)=>{
  let endX = e.changedTouches[0].clientX;
  if(endX - startX > 40) prev();
  if(startX - endX > 40) next();
  resetAutoplay();
});