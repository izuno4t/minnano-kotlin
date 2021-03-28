# minnano-kotlin

みんなのKotlinの写経

## Chapter 1

コンパイル

```zsh
% kotlinc hello.kt -include-runtime -d hello.jar
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by com.intellij.util.ReflectionUtil to method java.util.ResourceBundle.setParent(java.util.ResourceBundle)
WARNING: Please consider reporting this to the maintainers of com.intellij.util.ReflectionUtil
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
```

実行

```zsh
% java -jar hello.jar
com.example.demo.chapter1.Hello, world!
```
