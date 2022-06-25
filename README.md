# Trainee task

Comments on completing assignments:

* Be sure to provide the code with a comment (in English)
* Primarily interested in the source
* Tasks can be done in any programming language, if possible in Java - preferably in Java.
* Mandatory completion of all three tasks

### First task:

> If we discard numbers and operation signs from a correctly written arithmetic expression containing numbers, 
> operation signs and opening and closing parentheses, 
> and then write the brackets remaining in the expression without spaces between them, 
> then we will call the result obtained a correct bracket expression [bracket expression "(( )(()))" is correct, 
> but "()(" and "())(" are not]. 
> Find the number of correct bracket expressions containing N opening and N closing brackets. 
> N is entered from the keyboard. N is a non-negative integer.
>> Example: <br> N = 1 (one bracket each opening and closing) - answer 1 <br>
>> () <br>
>> )( <br>
>> )) <br>
>> (( <br>
>> Only one correct option.
> 
>> For the entered number 2 - 2 : <br>
>> ()() <br>
>> (()) <br>
>> That is, only two options, when all open brackets open / close correctly. <br>
>> And so on.

### Second task:

> You are given a list of cities. Each direct connection between two cities has its transportation cost (an integer bigger than 0). 
> The goal is to find the paths of minimum cost between pairs of cities. 
> Assume that the cost of each path (which is the sum of costs of all direct connections belonging to this path) 
> is at most 200000. The name of a city is a string containing characters a,...,z and is at most 10 characters long.2)
>> Input: <br>
>> s [the number of tests <= 10] <br>
>> n [the number of cities <= 10000] <br>
>> NAME [city name] <br>
>> p [the number of neighbors of city NAME] <br>
>> nr cost [nr - index of a city connected to NAME (the index of the first city is 1)] <br>
>> &emsp; [cost - the transportation cost] <br>
>> r [the number of paths to find <= 100] <br>
>> NAME1 NAME2 [NAME1 - source, NAME2 - destination] <br>
>> [empty line separating the tests]
> 
>> Output: <br>
>> cost [the minimum transportation cost from city NAME1 to city NAME2 (one per line)] <br>
> 
>> Example: <br>
>> Input: <br>
1 <br>
4 <br>
gdansk <br>
2 <br>
2 1 <br>
3 3 <br>
bydgoszcz <br>
3 <br>
1 1 <br>
3 1 <br>
4 4 <br>
torun <br>
3 <br>
1 3 <br>
2 1 <br>
4 1 <br>
warszawa <br>
2 <br>
2 4 <br>
3 1 <br>
2 <br>
gdansk warszawa <br>
bydgoszcz warszawa <br>
Output: <br>
3 <br>
2 <br>

### Third task:

> Find the sum of the digits in the number 100! (i.e. 100 factorial) <br>
{Correct answer: 648}