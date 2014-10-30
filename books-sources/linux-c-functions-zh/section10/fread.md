

fread（从文件流读取数据）
相关函数
fopen，fwrite，fseek，fscanf
表头文件
#include<stdio.h>
定义函数
size_t fread(void * ptr,size_t size,size_t nmemb,FILE * stream);
函数说明
fread()用来从文件流中读取数据。参数stream为已打开的文件指针，参数ptr 指向欲存放读取进来的数据空间，读取的字符数以参数size*nmemb来决定。Fread()会返回实际读取到的nmemb数目，如果此值比参数nmemb 来得小，则代表可能读到了文件尾或有错误发生，这时必须用feof()或ferror()来决定发生什么情况。
返回值
返回实际读取到的nmemb数目。
附加说明

范例
#include<stdio.h>
#define nmemb 3
struct test
{
char name[20];
int size;
}s[nmemb];
main()
{
FILE * stream;
int i;
stream = fopen(“/tmp/fwrite”,”r”);
fread(s,sizeof(struct test),nmemb,stream);
fclose(stream);
for(i=0;i<nmemb;i++)
printf(“name[%d]=%-20s:size[%d]=%d\n”,i,s[i].name,i,s[i].size);
}
执行
name[0]=Linux! size[0]=6
name[1]=FreeBSD! size[1]=8
name[2]=Windows2000 size[2]=11