lsearch（线性搜索）
相关函数
lfind
表头文件
#include<stdlib.h>
定义函数
void *lsearch(const void * key ,const void * base ,size_t * nmemb,size_t size, int ( * compar) (const void * ,const void *));
函数说明
lsearch()利用线性搜索在数组中从头至尾一项项查找数据。参数key指向欲查找的关键数据，参数base指向要被搜索的数组开头地址，参数nmemb 代表数组中的元素数量，每一元素的大小则由参数size 决定，最后一项参数compar 为一函数指针，这个函数用来判断两个元素是否相同，若传给compar 的第一个参数所指的元素数据和第二个参数所指的元素数据相同时则返回0，两个元素数据不相同则返回非0 值。如果lsearch（）找不到关键数据时会主动把该项数据加入数组里。
返回值
找到关键数据则返回找到的该笔元素的四肢，如果在数组中找不到关键数据则将此关键数据加入数组，再把加入数组后的地址返回。
范例
#include<stdio.h>
#include<stdlib.h>
#define NMEMB 50
#define SIZE 10
int compar (comst void *a,const void *b)
{
return (strcmp((char *) a, (char *) b));
}
main()
{
char data[NMEMB][SIZE]={“Linux”,”freebsd”,”solzris”,”sunos”,”windows”};
char key[80],*base,*offset;
int i, nmemb=NMEMB,size=SIZE;
for(i=1;i<5;i++){
fgets(key,sizeof9key),stdin);
key[strlen(key)-1]=’\0’;
base = data[0];
offset = (char *)lfind(key,base,&nmemb,size,compar);
if(offset ==NULL){
printf(“%s not found!\n”,key);
offset=(char *) lsearch(key,base,&nmemb,size,compar);
printf(“Add %s to data array\n”,offset);
}else{
printf(“found : %s \n”,offset);
}
}
}
执行
linux
found:linux
os/2
os/2 not found!
add os/2 to data array
os/2
found:os/2