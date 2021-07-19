PROJECT TITLE: CreditCardChecker
PURPOSE OF PROJECT: To check the validity of long credit card numbers
AUTHORS:M250 Module Team
USER INSTRUCTIONS:

//code to evaluate in the workspace for Q1(a)

CreditCardChecker ccc = new CreditCardChecker("4916592478445662");
ccc.getLongNumber();


//Credit card numbers to check

"272099998564591"     // not valid (too short) 
"2720999985645912"    // not valid - calculated check digit is 8
"5266509258235496"    // could be valid
"5266590258235496"    // could be valid
"4916618655349234"    // not valid - calculated check digit is 5
"4485735287746637"    // could be valid
"4365300588292181483" // not valid (too long)


