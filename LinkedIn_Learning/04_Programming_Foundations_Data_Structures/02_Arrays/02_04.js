var dinnerChoices = [["Salad", "Soup", "Cheese Plate"], ["Chicken", "Salmon", "Lasagna"]]

let appIndex = 0
let mainDishIndex = 1

let firstApp = dinnerChoices[appIndex][0]
let secondApp = dinnerChoices[appIndex][1]
let firstMainDish = dinnerChoices[mainDishIndex][2]

console.log(firstApp)
console.log(secondApp)
console.log(firstMainDish)

dinnerChoices[mainDishIndex][0] = "Steak"
console.log(dinnerChoices[mainDishIndex][0])

console.log(dinnerChoices)