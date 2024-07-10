# Forever

<img height=300 src="./assets/forever_dude.png"></img>

😊 Fluent 😊, ✨Modern ✨, and 🚀 Blazing Fast 🚀endless loops, made easy.

Requires Java 22 or better.

## Get it

```gradle
implementation('dev.mccue:forever:2024.07.09')
```

## Tutorial

Let's build a game where the computer gives words of encouragement
to the user. To start, we'll make a small little program that asks
for their name.

```java
void main() {
    var scanner = new Scanner(System.in);
    
    System.out.print("What's your name?: ");
    var name = scanner.nextLine();
    System.out.println("You're doing a great job " + name + "!");
}
```

But whoopsie! It only asks them for their name and gives positive feedback once! We want
that to go on forever!!

So let's import the library and get this train going.

```java
import dev.mccue.forever.For;

void main() {
    var scanner = new Scanner(System.in);

    for (; For.ever ;) {
        System.out.print("What's your name?: ");
        var name = scanner.nextLine();
        System.out.println("You're doing a great job " + name + "!");
    }
}
```

And now we will run that code for forever!

For those who love terse code (and you should, less code is best code 😊) you can
leave off one of the fors.

```java
import static dev.mccue.forever.For.ever;

void main() {
    var scanner = new Scanner(System.in);

    for (;ever;) {
        System.out.print("What's your name?: ");
        var name = scanner.nextLine();
        System.out.println("You're doing a great job " + name + "!");
    }
}
```

But we can do even better 💖. [In 2014, Java SE 8 saw the introduction of the concept of lambda expressions](https://dev.java/learn/lambdas/first-lambdas/).
[Lambda expressions were a powerful addition to the Java language starting in Java 8](https://dev.java/learn/lambdas/).

```java
import dev.mccue.forever.For;

void main() {
    var scanner = new Scanner(System.in);

    For.ever(() -> {
        System.out.print("What's your name?: ");
        var name = scanner.nextLine();
        System.out.println("You're doing a great job " + name + "!");
    });
}
```

## Get Help

* See the [Forever FAQ](https://youtu.be/7nsgZy4NNwA?si=gtXRPK-KssMzvvFk&t=27)
* Ask questions on Stack Overflow using the [forever tag](https://www.youtube.com/watch?v=q6EoRBvdVPQ&list=PLXKAG8g1Ls_Ax-SU7rCgyiGWjylB5NHL-&index=1)
* Join us on Slack: [#forever-users](https://973-eht-namuh-973.com/)

## Get Involved

* Learn how to [contribute](https://timetraveler.ytmnd.com/)
* See [issues](https://web.archive.org/web/20160112193916/http://timecube.com/) for issues you can help with

## Stay Informed

* X: [forever-project](https://twitter.com/dril)
* Blog: [Forever on Medium](https://zombo.com/)