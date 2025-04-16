# Adventure-Game-
Text-Based Adventure Game (Java)

This is a simple game you play in the terminal. The game tells you what’s happening, and you type what you want to do. You can move around, pick up things, and use items.

What you need:

You need Java installed (Java 8 or newer) and a terminal (like Command Prompt).

How to run the game:

First, download or clone the project. Go into the project folder.

Then compile the game by typing:
javac Game.java

After that, run the game with:
java Game

How to play:

The game tells you where you are and what you see. You type commands to do things.

First the game will prompt you to type your name. Next you can type >help to see the list of possioble commands. I recommend to start with look to see your initialized position in the game. Next you can move around and use items. Note: to use an item you need to have it in your inventory (you need to pickup an item first in order to use it).

Commands include:
look: describe your current location in the game
inventory: show your inventory
use <item>: use an item from your inventory
move <direction>: move north, south, east, or west
pickup <item>: pick up an item in the location
quit: exit the game


Files in the project:

Game.java runs the game.
Player.java keeps track of your character.
Location.java is for places in the game. Locations include Forest, Cave and City.
Item.java is for things you can pick up or use. Items include weapons (Weapon.java) which have different types, and consumables (Consumable.java) --> (Healing potion, Protein shake, Apple)
README.md is this file.

License:

This game is free to use or change.
