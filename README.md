# quotes

## Introduction

This application has two functions:

1. retrieve a random quote using a GET request from

        http://api.forismatic.com/api/1.0/?method=getQuote&format=json&lang=en
   and prints it to the console after adding the quote to the json file located [here](./src/main/resources/recentquotes.json)

2. in the event of a failed GET request, parses over a JSON file of quote objects and returns a quote along with the author

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
          
The API JSON format is of:

        {   "quoteText":"Limitations live only in our minds. But if we use our imaginations, our possibilities become limitless. ", 
            "quoteAuthor":"Jamie Paolinetti ", 
            "senderName":"", 
            "senderLink":"", 
            "quoteLink":"http://forismatic.com/en/c75165de1a/"
        }

The properties are mapped to the Quotes class using GSON. 

Install GSON in the build.gradle file with the following:

        
        dependencies {
            implementation 'com.google.code.gson:gson:2.8.5'
        }

You may use a different JSON file by specifying a different path string in the main method of the App.
In this case, also update the path it is being written to using the API.
     
run ./gradlew run to get a random quote from the console.