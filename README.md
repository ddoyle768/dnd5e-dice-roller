# dnd5e-dice-roller

This project is a basic dice roller using mechanics from the 5th edition of Dungeons and Dragons. It does not take in character information to adjust rolls, such as attack, ability, etc. modifiers. 

You are able to perform the following tasks:
1) Perform an ability check. This is where a 20-sided die is rolled while attempting to do a task in D&D to see if the player succeeds or fails the task. The program prompts if a user has Advantage on the roll (Roll 2 20-Sided dice and choose the higher of the 2 rolls to use), Disadvantage on the roll (Roll 2 20-Sided dice and choose the lower of the 2 rolls to use), or neither (Just rolls one 20-Sided Die).
2) Roll a 20-Sided Die for a "Saving Throw" against a usually negative effect that occurs in the game. The user enters the "Save DC" (number the player would need to meet or exceed to succeed on the attempt) for the save. The program will then roll the 20-Sided Die, compare against the user entered Save DC, and display a message stating whether they failed or succeeded.
3) Roll for a "Death Saving Throw" when a character is unconscious, potentially resulting in the character's death. While making death saving throws, the player must either succeed 3 death saving throws to stabilize at 1 Health Point, or fail 3 death saving throws resulting in death, whichever occurs first. This method rolls a 20-Sided Die and applies the following logic:
      - 1: The player fails two death saving throws
      - 2 - 10: The player fails one death saving throw
      - 11 - 19: The player succeeds one death saving throw
      - 20: The player immediately succeeds all remaining death saving throws, is conscious, and has 1 Health point
4) Roll damage for an attack dealt by either a player or an enemy. This method assumes you've either already succeeded on an attack roll against a target and/or are dealing some type of damage from an area effect. The amount of damage dealt per attack can vary in the size of the die used as well as how many of that die size are rolled. For example, one character's sword attack may only deal 1 8-sided die's worth of damage, while a spell cast by another character may deal 8 6-sided die's worth of damage. The user is prompted to enter the die size required for the roll, as well as how many dice to roll. The program will display each individual roll as well as the sum of all the rolls.
5) Roll on a table of some kind. This feature may be used in instances such as rolling on the "Wild Magic" table or an environmental hazards table. The program prompts the user how entries there are to choose from on the table of choice, rolls to decide which entry they should pick at random, and displays the number to choose.


Some of these rules have been modified to how I use them in my own personal games that I run, and will differ from how they are presented in official rule/source books.
This is solely a fan project, and I in no way claim ownership of any rules, regulations, etc. of Dungeons and Dragons 5th Edition.
