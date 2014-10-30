getchar（由标准输入设备内读进一字符）
相关函数
fopen，fread，fscanf，getc
表头文件
#include<stdio.h>
定义函数
int getchar(void);
函数说明
getchar()用来从标准输入设备中读取一个字符。然后将该字符从unsigned char转换成int后返回。
返回值
getchar()会返回读取到的字符，若返回EOF则表示有错误发生。
附加说明
getchar()非真正函数，而是getc(stdin)宏定义。
范例
#include<stdio.h>
main()
{
FILE * fp;
int c,i;
for(i=0li<5;i++)
{
c=getchar();
putchar(c);
}
}
执行
1234 /*输入*/
1234 /*输出*/