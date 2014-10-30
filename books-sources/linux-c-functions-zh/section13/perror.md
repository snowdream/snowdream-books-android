
perror（打印出错误原因信息字符串）
<pre>相关函数
strerror
表头文件
#include< stdio.h>
定义函数
void perror(const char *s);
函数说明
perror()用来将上一个函数发生错误的原因输出到标准错误(stderr)。参数s所指的字符串会先打印出，后面再加上错误原因字符串。此错误原因依照全局变量errno的值来决定要输出的字符串。
返回值

范例
#include< stdio.h>
main()
{
FILE *fp;
fp = fopen(“/tmp/noexist”,”r+”);
if(fp = =NULL) perror(“fopen”);
}
执行
$ ./perror
fopen : No such file or diretory</pre>