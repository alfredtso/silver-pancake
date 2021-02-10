#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define LIST_SIZE 10

/**
struct _person {
        char* firstName;
        char* lastName;
        char* title;
        unsigned int age;
};
*/

// Often coupled with typedef keyword to simplify the use later
typedef struct _person {
  char *firstName;
  char *lastName;
  char *title;
  unsigned int age;
} Person;

typedef struct _alternatePerson {
  char *firstName;
  char *lastName;
  char *title;
  unsigned int age;
} AlternatePerson;

void initializeList(Person* list[]) {
	for (int i = 0; i < LIST_SIZE; i++) {
		list[i] = NULL;
	}
}

Person *getPerson(Person *list[]) {
  for (int i = 0; i < LIST_SIZE; i++) {
    if (list[i] != NULL) {
		// get the structure
      Person *ptr = list[i];
	  // mark it NULL so that it wont be doulbe get
	  list[i] = NULL;
	  return ptr;
    }
  }
  Person* ptr = (Person*) malloc(sizeof(Person));
  return ptr;
}

int main() {

  // An instance
  Person rachel;
  rachel.firstName = (char *)malloc(strlen("Rachel") + 1);
  strcpy(rachel.firstName, "Rachel");
  rachel.age = 28;

  // An pointer is declare like this
  Person *alfred;
  alfred = (Person *)malloc(sizeof(Person));
  alfred->firstName = (char *)malloc(strlen("Alfred") + 1);
  strcpy(alfred->firstName, "Alfred");
  alfred->age = 31;

  // alternatively, can dereference first then .

  Person person;
  AlternatePerson altPerson;
  printf("%lu\n", sizeof(person));
  printf("%lu\n", sizeof(altPerson));

  // Pool of structures
  Person* list[LIST_SIZE];
  initializeList(list);

}
