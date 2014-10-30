mkstemp（建立唯一的临时文件）
相关函数
mktemp
表头文件
#include<stdlib.h>
定义函数
int mkstemp(char * template);
函数说明
mkstemp()用来建立唯一的临时文件。参数template 所指的文件名称字符串中最后六个字符必须是XXXXXX。Mkstemp()会以可读写模式和0600 权限来打开该文件，如果该文件不存在则会建立该文件。打开该文件后其文件描述词会返回。文件顺利打开后返回可读写的文件描述词。若果文件打开失败则返回NULL，并把错误代码存在errno 中。
错误代码
EINVAL 参数template 字符串最后六个字符非XXXXXX。EEXIST 无法建立临时文件。
附加说明
参数template所指的文件名称字符串必须声明为数组，如:
char template[ ] =”template-XXXXXX”;
千万不可以使用下列的表达方式
char *template = “template-XXXXXX”;
范例
#include<stdlib.h>
main( )
{
int fd;
char template[ ]=”template-XXXXXX”;
fd=mkstemp(template);
printf(“template = %s\n”,template);
close(fd);
}
执行
template = template-lgZcbo