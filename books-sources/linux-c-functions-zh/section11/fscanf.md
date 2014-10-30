fscanf（格式化字符串输入）
相关函数
scanf，sscanf
表头文件
#include<stdio.h>
定义函数
int fscanf(FILE * stream ,const char *format,....);
函数说明
fscanf()会自参数stream的文件流中读取字符串，再根据参数format字符串来转换并格式化数据。格式转换形式请参考scanf()。转换后的结构存于对应的参数内。
返回值
成功则返回参数数目，失败则返回-1，错误原因存于errno中。
附加说明

范例
#include<stdio.h>
main()
{
int i;
unsigned int j;
char s[5];
fscanf(stdin,”%d %x %5[a-z] %*s %f”,&i,&j,s,s);
printf(“%d %d %s \n”,i,j,s);
}
执行
10 0x1b aaaaaaaaa bbbbbbbbbb /*从键盘输入*/
10 27 aaaaa