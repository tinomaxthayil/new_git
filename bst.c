#include<stdio.h>
#include<stdlib.h>


struct node{
	int key;
	struct node *left,*right;
};

struct node *newNode(int item){
struct node *temp = (struct node *)malloc(sizeof(struct node));
temp->key = item;
temp->right=NULL;temp->left = NULL;
return temp;
};

struct node *insert(struct node *node,int item)
{
if (node==NULL) return newNode(item);

else if (node->key < item) {node->right = insert(node->right,item);	}

else if (node->key > item) {node->left = insert(node->left,item); }

return node;
};

void inorder(struct node *root)
{
	if (root != NULL)
	{
		inorder(root->left);
		printf("%d\n",root->key );
		inorder(root->right);
	} 
}

int main()
{	int val,n;
	struct node *root = NULL;
	printf("Enter the no of elements in the tree\n");
	scanf("%d",&n);

	printf("Enter the element of the tree");
	scanf("%d",&val);
	root = insert(root,val);
	
	for(int i=1;i<n;i++){
	printf("Enter the element of the tree");
	scanf("%d",&val);
	insert(root,val);
	}
	inorder(root);
}