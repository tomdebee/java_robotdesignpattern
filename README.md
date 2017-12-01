# java_robotdesignpattern
This project was an attempt to concretely implement a command design pattern onto an earlier similar project with cleaner code.

# Developfeature
This seperate branch is an extension of the commandpattern-branch. Multiple commands can be queued and executed seperately, and commands can be undone.



As part of an assignment to identify problems on which a design pattern can be applied, together with [Frank Blikslager (github)](https://github.com/frankblikslager) I implemented the Command Design pattern. 

## Description
This code contains uncompiled java code without an interface and built as an example of the design pattern rather than as a complete program.

## Theory
A command pattern is defined by the implementation of an interface that allow for any command to be executed, and the execution of these commands is done by a seperate invoker. 

## Usage
In practice, a user can give move-commands (moveRight...) to a QueueRunner. This queue stores commands and only invokes the commands if the user gives the execute-command.

Any kind of move can be added by making a class implementing the ICommand-interface. (e.g. MoveThreeSpacesForward etc.)
