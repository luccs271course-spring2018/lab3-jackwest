Questions:

also try with a LinkedList - does it make any difference?
The difference is a few milliseconds on two test functions. Contains and retainAll took 2 milliseconds longer than the arrayList counter part.

list.remove(5) -> what does this method do?
This method will remove the value of at index 5. The reason is because 5 is not the type held in the array the type is the Integer object not the primitive data type int. If the method was instead list.remove(Integer.valueOf(5)), then it would remove the integer object of five no matter the position.

list.remove(Integer.valueOf(5) -> what does this one do?
This method will remove the integer object with the value of 5. This method will scan through the array and remove the Integer object with the value of five rather than the index.

list.remove(Integer.valueOf(33)) -> what does this one do?
As with the method above, it will remove the integer object with a value of 33 instead of the index of of 33.

what happens if you use list.remove(77)?
This will throw a error, the reason being is because the type of the input is int. Meaning, the method will interpret the 77 as the index rather than the integer object.

which of the two lists performs better as the size increases?
The Array list preforms better with the bigger size when it is being accessed, but linked lists preform better when being added or removed. At size 1000 with 100000 Reps, the ArrayList Access method takes 13 milliseconds, where as the Linked list Access method took 4 seconds. For the add remove methods, the Linked List finished in about 22 millisecond. Where as Array List add remove method took 3 seconds. The results were similar with the smaller sizes as well.


