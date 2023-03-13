# Project: Minesweeper CLI

![Deploy_badge](https://github.com/mitchanderson202/Minesweeper/actions/workflows/main.java/badge.svg)

## Demo & Snippets

<img width="173" alt="minesweeper game image" src="https://user-images.githubusercontent.com/78459081/224581793-d3dbd8db-39d6-4a72-98ef-6a135cb2baa6.png">


---

## Requirements

- 10x10 array, it was suggested to use a 2d array, but it was out choice.
- User will be able to enter a command that selects coordinates on the grid.
- Render the grid everytime a selection has been made.
- If the user selects a bomb, Game Over.
- Must have the option to play again.

## Stack

- Java

---

## Build Steps

- Fork this repo
- Open project in your terminal of choice and run the Main.java file

---

## Design Goals / Approach

- I wanted to have a grid with numbers 1-10 and 10-1 running on the left and bottom of the grid. The current iteration has this, but needs some spacing or | around it to seperate from the bomb numbers and the row/cols numbers. When I first designed the project in my mind this was a great idea but it wasn't until I put it together that I realised how the numbers looked next to eachother.

---

## Known issues

- Numbers for the Rows/Cols don't have any spacing or lines between them and the bomb numbers.
- Not enough tests.

---

## Future Goals

- Fix the number spacing. Maybe make the grid gaps bigger too(depends how this looks).
- Continue to add tests.
- I would love to add the option of Flags.
- Need to check out some animations for the reveal of empty space.
- Add an option to have a bigger grid with more bombs. (Easy/Medium/Hard)
- Add colors to cli.

---

## Change logs

- 13/03/23. Updated Readme.

## What did you struggle with?

- First time using Java. Getting used to type casting was the initial issue. From there using the 2d Array and being able to iterate over it chosing a particular spot.
- I didn't spend enough time planning the project, I jumped straight in and hit a road block after creating the grid. I pieced it together eventually, but things could have been better.
