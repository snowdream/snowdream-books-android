bsearch（二元搜索）
相关函数
qsort
表头文件
#include<stdlib.h>
定义函数
void *bsearch(const void *key,const void *base,size_t nmemb,size_tsize,int (*compar) (const void*,const void*));
函数说明
bsearch()利用二元搜索从排序好的数组中查找数据。参数key指向欲查找的关键数据，参数base指向要被搜索的数组开头地址，参数nmemb 代表数组中的元素数量，每一元素的大小则由参数size决定，最后一项参数compar 为一函数指针，这个函数用来判断两个元素之间的大小关系，若传给compar 的第一个参数所指的元素数据大于第二个参数所指的元素数据则必须回传大于0 的值，两个元素数据相等则回传0。
附加说明
找到关键数据则返回找到的地址，如果在数组中找不到关键数据则返回NULL。
范例
#include<stdio.h>
#include<stdlib.h>
#define NMEMB 5
#define SIZE 10
int compar(const void *a,const void *b)
{
return (strcmp((char *)a,(char *)b));
}
main()
{
char data[50][size]={“linux”,”freebsd”,”solaris”,”sunos”,”windows”};
char key[80],*base ,*offset;
int i, nmemb=NMEMB,size=SIZE;
while(1){
printf(“>”);
fgets(key,sizeof(key),stdin);
key[strlen(key)-1]=’\0’;
if(!strcmp(key,”exit”))break;
if(!strcmp(key,”list”)){
for(i=0;i<nmemb;i++)
printf(“%s\n”,data[i]);
continue;
}
base = data[0];
qsort(base,nmemb,size,compar);
offset = (char *) bsearch(key,base,nmemb,size,compar);
if( offset = =NULL){
printf(“%s not found!\n”,key);
strcpy(data[nmemb++],key);
printf(“Add %s to data array\n”,key);
}else{
printf(“found: %s \n”,offset);
}
}
}
执行
>hello /*输入hello字符串*/
hello not found! /*找不到hello 字符串*/
add hello to data array /*将hello字符串加入*/
>.list /*列出所有数据*/
freebsd
linux
solaris
sunos
windows
hello
>hello
found: hello