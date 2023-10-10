
const products = {
        "Значение 1": 10,
        "Значение 2": 10,
        "Значение 3": 10,
        "Значение 4": 10,
        "Значение 5": 10,
        "Значение 6": 10,
        "Значение 7": 10,
        "Значение 8": 10,
        "Значение 9": 10,
        "Значение 10": 10,
        "Значение 11": 10,
        "Значение 12": 10,
}

let productsSelect = document.getElementById("products-select");

for (const [product, price] of Object.entries(products)) {
    const option = document.createElement("option");
    const name = document.createTextNode(product);
    option.setAttribute("value", price);
    option.appendChild(name);
    productsSelect.appendChild(option);
}
button.onclick = function() {
  let f1 = document.getElementsByName("products");
  let f2 = document.getElementsByName("count");
  let r = document.getElementById("result");
  if (!Number(f2[0].value)) {
    alert("Поле 2 не является числом");
    r.innerHTML = none;
    return false;
  }
   if (f2[0].value < 0) {
    alert("Поле 2 не может быть отрицательным!");
    r.innerHTML = none;
    return false;
  }

  r.innerHTML = parseInt(f1[0].value) * f2[0].value;
  return false;
}