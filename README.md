# quotes

## Introduction

This application parses over a JSON file of quote objects and returns a quote along with the author

## Instructions

This Java project uses Gradle as its build tool.

The JSON should be an array of objects with the following properties:

          {
            "tags": [
              "attributed-no-source"
            ],
            "author": "Marilyn Monroe",
            "likes": "18651 likes",
            "text": " “I am good, but not an angel. I do sin, but I am not the devil. I am just a small girl in a big world trying to find someone to love.” "
          }
          
The properties are mapped to the Quotes class using GSON. 

Install GSON in the build.gradle file with the following:

        
        dependencies {
            implementation 'com.google.code.gson:gson:2.8.5'
        }

You may use a different JSON file by specifying a different path string in the main method of the App.
     
run ./gradlew run to get a random quote from the console.