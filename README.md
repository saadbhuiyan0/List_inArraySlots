# List_inArraySlots
**Saad Bhuiyan and Franklin Liou**



## [4F_List_inArraySlots_v0](4F_List_inArraySlots_v0)

### [List_inArraySlots.java](4F_List_inArraySlots_v0/List_inArraySlots.java)
Members:
- Private field `int[] elements` field to store integer values in an array.
- Private field `int filledElements` to keep track of number of integers added to `elements`.
- Private static field `int INITIAL_CAPACITY` holds the value to be used in setting the length of the array `elements` upon initialization.
- `List_inArraySlots()` constructor that initializes an array `elements` of length INITIAL_CAPACITY.
- `size()` method which is a getter method that returns value stored in field `filledElements`.
- `toString()` method which only returns values that have been appended via the `add(int value)` method in format "[a,b,c,]".
- `add(int value)` method which appends `value` to the end of stored values in `elements`. It first uses the `expand()` method if there is not enough space for `value` to be appended.
- `expand()` method which utilizes a temporary array of `int`s `bigger` which is double the length of `elements` (by convention) to transfer the values in array `elements` to array `bigger` before assigning the array `elements` a reference to array `bigger`.

### [UserOfList.java](4F_List_inArraySlots_v0/UserOfList.java)
The purpose of [UserOfList.java]((4F_List_inArraySlots_v0/UserOfList.java) is to ensure [List_inArraySlots.java](4F_List_inArraySlots_v0/List_inArraySlots.java) functions as expected. By utilizing methods in [List_inArraySlots.java](4F_List_inArraySlots_v0/List_inArraySlots.java) and printing the results, we are able to see whether the program is running as expected (if it is not, we can make changes incrementally).



## [50_List_inArraySlots_v1](50_List_inArraySlots_v1)

### [List_inArraySlots_addenda.java](50_List_inArraySlots_v1/List_inArraySlots_addenda.java)
Additions to [List_inArraySlots.java](4F_List_inArraySlots_v0/List_inArraySlots.java):
- `get(int index)` method which returns the value stored in the array at the input index.
- `set(int index, int newValue)` method assigns `newValue` to `elements[index]` and returns the old value at `elements[index]`.
- `remove(int index)` method removes the value at `element[index]` and shifts the subsequent values down by one index/position. It then returns the removed value.
- `add(int index, int value)` method adds the value to `element[index]` and shifts the value and subsequent values up by one index/position.



## [51_List_typesWoPolymorphism](51_List_typesWoPolymorphism)

### [List_inArraySlots.java](51_List_typesWoPolymorphism/List_inArraySlots.java)
To be updated. 
