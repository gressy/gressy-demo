Gressy-Demo
===========

Part of the Gressy Project.

This repository is a demo of a fully-configured project using all the pieces composing Gressy.

It can also serve as a starting point if you don't want to use the scaffold for some reason.

Getting started
---------------

To build everything locally, you can follow these steps:

- Install the [Lightbend Activator](https://www.lightbend.com/activator/download).
- Clone this repository, if you haven't done it yet.
- On the `gressy-demo` folder, do:

    > activator run

Developing Gressy
-----------------
If you want to make changes to the other Gressy subprojects, or don't want to
use the Maven respository copies, you must build them and add them to the local
ivy repository.

To do it, just:

- Clone the [Gressy Entities](https://github.com/gressy/gressy-entities.git) repository.
- On the `gressy-entities` folder, do:

    > activator clean compile publish-local
