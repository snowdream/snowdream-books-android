mktemp（产生唯一的临时文件名）
相关函数
tmpfile
表头文件
#include<stdlib.h>
定义函数
char * mktemp(char * template);
函数说明
mktemp()用来产生唯一的临时文件名。参数template所指的文件名称字符串中最后六个字符必须是XXXXXX。产生后的文件名会借字符串指针返回。
返回值
文件顺利打开后，指向该流的文件指针就会被返回。如果文件打开失败则返回NULL，并把错误代码存在errno中。
附加说明
参数template所指的文件名称字符串必须声明为数组，如:
char template[ ]=”template-XXXXXX”；
不可用char * template=”template-XXXXXX”；
范例
#include<stdlib.h>
main()
{
char template[ ]=”template-XXXXXX”;
mktemp(template);
printf(“template=%s\n”,template);
}