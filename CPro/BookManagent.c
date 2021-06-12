//Write a program to create Book management System using Linked List.
#include<stdio.h>
#include<stdlib.h>
#include<string.h>

typedef struct Node{
	int id;	
	char name[20];
	char author[20];
	int price;
}Node;

typedef struct Book{
	Node data;
	struct Book *next;
}book;

book* CreateList()
{
 	int i;
	book *h, *tail, *p;
	h=tail=(book*)malloc(sizeof(book));
	h->next = NULL;
	int n = 0;
	printf("\n Enter the number of books to be entered : ");
	scanf("%d", &n);
	for (i = 0; i < n; i++)
	{
		p = (book*)malloc(sizeof(book));
		printf("\n Book id : ");
		scanf("%d",&p->data.id);
		printf("\n Book Title : ");
		scanf("%s",&p->data.name);
		printf("\n Author :");
		scanf("%s",&p->data.author);
		printf("\n Price :");
		scanf("%d",&p->data.price);
		p->next = NULL;
		tail->next = p; 
		tail = p;
	}

	return h;
}
void Insert(book*h)// insert (head insertion method)
{
        book *p,*temp;
		p = (book*)malloc(sizeof(book));		
		printf("\n Book id :");
		scanf("%d", &p->data.id);
		printf("\n Book Title :");
		scanf("%s", &p->data.name);
		printf("\n Author :");
		scanf("%s", &p->data.author);
		printf("\n Price :");
		scanf("%d", &p->data.price);				
	    p->next = NULL;
		temp = h;
		while(temp->next != NULL)
			temp = temp->next;	//increment temp
		temp->next = p;
	//	p->next = h->next;
		//h->next = p;
	
}
void Search1(book*h)// Book title search
{
	char name[20];
	book *p = h->next;
	printf("\n Enter the title you want to find : ");
	scanf("%s",&name);
	while (p!=NULL)
	{
		if (strcmp(p->data.name,name)!=0)
		{
			p = p->next;
		}
		else 
		{
			printf("\n Book id \t Book Title \t Author \t Price ");
			printf("\n %d \t %s \t %s %d ",p->data.id,p->data.name,p->data.author,p->data.price);
			return;
		}
	}
	if (p == NULL)
	{
		printf("\n Not found! ");
	}
}
void Search2(book*h)// price search
{
	int minPrice, maxPrice;
	book *p = h;
	printf("\n Enter the Price (Min and Max) : ");
	scanf("%d%d", &minPrice, &maxPrice);
	printf("\n Book id \t Book Title \t Author \t Price ");
	while (p->next != NULL)
	{
		if ((p->data.price < maxPrice) && (p->data.price > minPrice))	//	strcmp(p->data.price, price)!=0
		{
			printf("\n %d \t %s \t %s %d ",p->data.id,p->data.name,p->data.author,p->data.price);
		}
		p = p->next;
	}
	if (p == NULL)
	{
		printf("\n Not found! ");
	}
}
void PrintList(book*h)// output
{
	book *p;
	printf("\n Book id \t Book Title \t Author \t Price ");
	for (p = h->next; p != NULL; p = p->next)
	{
		printf("\n");
		printf("%d\t", p->data.id);
		printf("%s\t", p->data.name);
		printf("%s\t", p->data.author);
		printf("%d\t", p->data.price);
	}
}
void delete(book*h)
{
	int id;// Delete by id because ISBN is unique
	book *p = h->next;
	book *tail = h;
	printf("\n Enter the id of the book to be deleted : ");
	scanf("%d", &id);
	while (p != NULL)
	{
		if (p->data.id != id)	//strcmp(p->date.id, id)!=0
		{
			p = p->next;
			tail = tail->next;
		}
		else
		{
			tail->next = p->next;
			free(p);
			return;
		}
	}
}
void menu()
{
	printf("\n --------- Book Management System --------- ");
	printf("\n ************ 1. Create **************");
	printf("\n ************ 2. Insert **************");
	printf("\n ************ 3. List ************** ");
	printf("\n ************ 4. Search by title ****** ");
	printf("\n ************ 5. Search by Price ******* ");	
	printf("\n ************ 6. Delete ************** ");
	printf("\n Note: Only enter once, otherwise it will overwrite ");
}
void choose(book*h)
{
	int ch;
	int a = 1;

	while (a>0)
	{
		menu();
		printf("\n please enter valid choose : ");
		scanf("%d",&ch);
		switch (ch)
		{
			case 1:
					h=CreateList();
					break;
			case 2:
					Insert(h);
					break;
			case 3:
					PrintList(h);
					break;
			case 4:
					Search1(h);
					break;
			case 5:
					Search2(h);
					break;
			case 6:
				    delete(h);
					break;
					
			default:
					printf("Invalid Choose ! ");
					a = -1;// jump out of the loop condition 
					break;
		}
	}
}

int main()
{
	book *head = NULL;
	choose(head);
	return 0;
}
