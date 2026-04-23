# MIT 6.830 SimpleDB Lab1 练功房

本项目是基于 MIT 6.830 Database Systems 课程的 SimpleDB 实现。

## 🚀 核心目标 (Lab 1)
实现一个基于磁盘的存储引擎，能够将二进制数据读取并解析为内存中的 Tuple。

## 🛠 关键操作指南

### 环境与编译
- **编译项目**: `ant dist` (生成 dist/simpledb.jar)
- **运行单元测试**: `ant runtest -Dtest=[TestName]` (例如: `ant runtest -Dtest=TupleTest`)
- **运行系统测试**: `ant systemtest` (最后通关时运行)

### 数据转换 (用于自定义测试)
如果你有 `file.txt` (格式: `int,int,int`)，将其转换为数据库 HeapFile 格式：
`java -jar dist/simpledb.jar convert file.txt N` (N 为列数)

### 查看数据内容
`java -jar dist/simpledb.jar print file.dat N`

## 📅 路线图 (Section 2 Implementation Guide)
- [ ] Exercise 1: Tuple & TupleDesc (数据原子结构)
- [ ] Exercise 2: Catalog (表字典管理)
- [ ] Exercise 3: BufferPool (内存缓冲管理)
- [ ] Exercise 4: HeapPage & HeapFile (磁盘随机读写)
- [ ] Exercise 5: SeqScan (顺序扫描算子)




### Fields and Tuples
- Field (字段)：最基本的数据单元（比如一个整数 18 或字符串 "Alice"）。

- Tuple (元组/行)：由多个 Field 组成的一行具体数据 。

- TupleDesc (行描述符)：这一行数据的**“说明书”**。它规定了这一行有几列、每一列叫什么名字、是什么类型（INT 还是 STRING） 。

- DbFile / HeapFile (表/文件)：这才是真正意义上的**“表”**。它包含了许多个 Tuple，并且整个文件共享同一个 TupleDesc。



