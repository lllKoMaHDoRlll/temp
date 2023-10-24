const products = {
  "Хлеб": 70,
  "Картофель": 150,
  "Зелень": 40,
  "Молоко": 90,
  "Яйца": 140,
  "Каша пшеничная": 100,
  "Каша гречневая": 110,
  "Яблоки": 120,
  "Груши": 130,
  "Сливы": 120,
  "Огурцы": 150,
  "Помидоры": 170,
}

function getResult() {
  let f1 = document.getElementsByName("products");
  let f2 = document.getElementsByName("count");
  let r = document.getElementById("result");

  if (f1[0].value === "") {
    alert("Выберете товар из списка");
    r.innerHTML = " ";
    return false;
  }

  if (!Number(f2[0].value)) {
    alert("Поле 2 не является числом");
    r.innerHTML = " ";
    return false;
  }
  if (f2[0].value < 0) {
    alert("Поле 2 не может быть отрицательным!");
    r.innerHTML = " ";
    return false;
  }

  r.innerHTML = parseInt(f1[0].value) * f2[0].value;
  return false;
}

document.addEventListener("DOMContentLoaded", function () {
  let productsSelect = document.getElementById("products-select");

  for (const [product, price] of Object.entries(products)) {
    const option = document.createElement("option");
    const name = document.createTextNode(product);
    option.setAttribute("value", price);
    option.appendChild(name);
    productsSelect.appendChild(option);
  }

  let button = document.getElementById("button");
  button.addEventListener("click", getResult);
});


