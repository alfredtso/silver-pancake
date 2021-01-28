#include <stdio.h>
#include <ctype.h>
#include <string.h>
#include <stdlib.h>

typedef int (fptrOperation)(const char*, const char*);

int compare(const char* s1, const char* s2) {
	return strcmp(s1, s2);
}

char* stringToLower(const char* s) {
	// declare a new pointer to string
	char* tmp = (char*) malloc(strlen(s)+1);

	// declare a pointer to increment
	char* ptr = tmp;

	// check the s pointer
	printf("Before incrementing the copy of pointer: %p\n", s);

	while(*s != 0){
		// It get a copy of the pointer s, so the actual s wont be affected
		*ptr++ = tolower(*s++);
	}
	*ptr = 0;
	printf("After incrementing the copy of pointer: %p\n", s);

	return tmp;
}

int compareIgnoreCase(const char* s1, const char* s2) {
	printf("Pointer s1: %p\n", s1);
	char* tmp1 = stringToLower(s1);
	printf("Pointer s1: %p\n", s1);
	char* tmp2 = stringToLower(s2);
	int result = compare(tmp1, tmp2);
	free(tmp1);
	free(tmp2);
	return result;
}

// based on bubble sort
void sort(char* arrayOfString[], int size, fptrOperation op) {
	int swap = 1;
	while (swap) {
		swap = 0;
		for (int i = 0; i < size-1; i++) {
			if (op(*(arrayOfString+i), *(arrayOfString+i+1)) > 0){
				swap = 1;
				char* tmp = *(arrayOfString+i);
				*(arrayOfString+i) = *(arrayOfString+i+1);
				*(arrayOfString+i+1) = tmp;
			}
		}
	}
}

void displayNames(char* names[], int size) {
	for (int i = 0; i < size; i++) {
		printf("%s\t", names[i]);
	}
	printf("\n");
}

int main() {
	char* s1 = "diu";
	char* s2 = "Mud";
	printf("Before comparingIgnoreCase: %s\n", s1);

	int result;
	result = compareIgnoreCase(s1, s2);
	printf("Result is %d\n", result);
	printf("After comparingIgnoreCase: %s\n", s1);

	// Display name sorting example
	char* names[] = {"Bob", "Ted", "Alice"};
	sort(names, 3, compare);
	displayNames(names,3);
}
	
