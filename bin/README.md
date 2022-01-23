## Description

1. Accept input from a user that specifies the input file to be used.
1. Accept input from a user that specifies the zoom level to expand the original image to.
	1. The zoom level must be a perfect square, since in our zoom algorithm we will be copying a single character into an _n&#8290;n_ grid where the zoom level is equal to n&#8290;n.
		1. For example:
			```
			@
			```
			with a zoom level of 9 becomes:
			```
			@@@
			@@@
			@@@
			```
1. Accept an output file name from the user where the zoomed version of the image should be written.

### Sample Input File [boat.txt](boat.txt)
```
              .
                .'|     .8
               .  |    .8:
              .   |   .8;:        .8
             .    |  .8;;:    |  .8;
            .     n .8;;;:    | .8;;;
           .      M.8;;;;;:   |,8;;;;;
          .    .,"n8;;;;;;:   |8;;;;;;
         .   .',  n;;;;;;;:   M;;;;;;;;
        .  ,' ,   n;;;;;;;;:  n;;;;;;;;;
       . ,'  ,    N;;;;;;;;:  n;;;;;;;;;
      . '   ,     N;;;;;;;;;: N;;;;;;;;;;
     .,'   .      N;;;;;;;;;: N;;;;;;;;;;
    ..    ,       N6666666666 N6666666666
    I    ,        M           M
   ---nnnnn_______M___________M______mmnnn
         "-.                          /
 ~~~~~~~~~~~@@@**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
```

### Sample Output File
```
                            ..
                            ..
                                ..''||          ..88
                                ..''||          ..88
                              ..    ||        ..88::
                              ..    ||        ..88::
                            ..      ||      ..88;;::                ..88
                            ..      ||      ..88;;::                ..88
                          ..        ||    ..88;;;;::        ||    ..88;;
                          ..        ||    ..88;;;;::        ||    ..88;;
                        ..          nn  ..88;;;;;;::        ||  ..88;;;;;;
                        ..          nn  ..88;;;;;;::        ||  ..88;;;;;;
                      ..            MM..88;;;;;;;;;;::      ||,,88;;;;;;;;;;
                      ..            MM..88;;;;;;;;;;::      ||,,88;;;;;;;;;;
                    ..        ..,,""nn88;;;;;;;;;;;;::      ||88;;;;;;;;;;;;
                    ..        ..,,""nn88;;;;;;;;;;;;::      ||88;;;;;;;;;;;;
                  ..      ..'',,    nn;;;;;;;;;;;;;;::      MM;;;;;;;;;;;;;;;;
                  ..      ..'',,    nn;;;;;;;;;;;;;;::      MM;;;;;;;;;;;;;;;;
                ..    ,,''  ,,      nn;;;;;;;;;;;;;;;;::    nn;;;;;;;;;;;;;;;;;;
                ..    ,,''  ,,      nn;;;;;;;;;;;;;;;;::    nn;;;;;;;;;;;;;;;;;;
              ..  ,,''    ,,        NN;;;;;;;;;;;;;;;;::    nn;;;;;;;;;;;;;;;;;;
              ..  ,,''    ,,        NN;;;;;;;;;;;;;;;;::    nn;;;;;;;;;;;;;;;;;;
            ..  ''      ,,          NN;;;;;;;;;;;;;;;;;;::  NN;;;;;;;;;;;;;;;;;;;;
            ..  ''      ,,          NN;;;;;;;;;;;;;;;;;;::  NN;;;;;;;;;;;;;;;;;;;;
          ..,,''      ..            NN;;;;;;;;;;;;;;;;;;::  NN;;;;;;;;;;;;;;;;;;;;
          ..,,''      ..            NN;;;;;;;;;;;;;;;;;;::  NN;;;;;;;;;;;;;;;;;;;;
        ....        ,,              NN66666666666666666666  NN66666666666666666666
        ....        ,,              NN66666666666666666666  NN66666666666666666666
        II        ,,                MM                      MM
        II        ,,                MM                      MM
      ------nnnnnnnnnn______________MM______________________MM____________mmmmnnnnnn
      ------nnnnnnnnnn______________MM______________________MM____________mmmmnnnnnn
                  ""--..                                                    //
                  ""--..                                                    //
  ~~~~~~~~~~~~~~~~~~~~~~@@@@@@****~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  ~~~~~~~~~~~~~~~~~~~~~~@@@@@@****~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
```

## Example Program Run
The program will be run by pasting text into the terminal.
Sample input:
```
zzzz            // This is a file that does not exist so it should prompt again for the filename
boat.txt        // Valid file that exists in the workspace
5               // square root of 5 is not an integer, ask for another zoom level
7               // square root of 7 is not an integer, ask for another zoom level
4               // square root of 4 is an integer
boat-out.txt     // File to write to
```
