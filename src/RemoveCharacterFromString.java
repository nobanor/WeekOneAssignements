����   4 o  'WeekTwoMonday/RemoveCharacterFromString  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this )LWeekTwoMonday/RemoveCharacterFromString; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   "Please enter a word and a letter: 
 " $ # java/io/PrintStream % & println (Ljava/lang/String;)V
  ( ) * next ()Ljava/lang/String;
 , . - java/lang/String / 0 charAt (I)C
  2 3 4 
removeChar '(Ljava/lang/String;C)Ljava/lang/String;
  6 7 8 removeCharFromArray ([CC)[C
 " : % ; ([C)V args [Ljava/lang/String; sc Ljava/util/Scanner; 	userInput Ljava/lang/String; letterAsString letter C result word [C I  
 , K L * toLowerCase
 N P O java/lang/Character L Q (C)C S java/lang/StringBuilder
 , U V W valueOf &(Ljava/lang/Object;)Ljava/lang/String;
 R Y  &
 R [ \ ] append (C)Ljava/lang/StringBuilder;
 R _ ` * toString
 , b c d length ()I i I StackMapTable
 , i j k toCharArray ()[C lowerCaseLetter 
SourceFile RemoveCharacterFromString.java !               /     *� �    
                    	       �     r� Y� � L� � !+� 'M+� 'N-� +6,� 1:� � !�YAUYvUYeUYrUYaUYnUYgUYeU:� a� 5� 9�    
   * 
            $  ,  4  d  q     H    r < =    g > ?   Z @ A   U B A  $ N C D  , F E A  d  F G  	 3 4     �     ?HM*� JK� M<>� &*� +� � RY,� T� X*� +� Z� ^M�*� a���,�    
   "    )  *  +  -  2  4 2 - = 8    *    ? F A     ? C D   < E A   . e f  g    �  , 	 7 8     �     >� M<HM>� )*4� M6� � RY,� T� X*4� Z� ^M�*����,� h�    
   "    =  ?  @  B  C  E 0 @ 9 I    4    > F G     > C D   6 E A  
 / e f    l D  g    �  ,"  m    n