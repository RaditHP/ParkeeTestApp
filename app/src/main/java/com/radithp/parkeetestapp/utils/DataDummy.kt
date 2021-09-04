package com.radithp.jetpacksubmission3.utils


import com.radithp.jetpacksubmission3.data.source.remote.MoviesResponse
import com.radithp.parkeetestapp.data.local.entity.MovieEntity
import java.util.ArrayList

/**
Created by radit
 */
object DataDummy {
    fun generateMovies():List<MovieEntity>{
        val movies = ArrayList<MovieEntity>()

        movies.add(
            MovieEntity(
                "m1",
                "Top Gun",
                "Code-named \"Maverick\", Pete Mitchell, the impetuous daredevil Navy-pilot ace, is accepted into Miramar's elite Fighter School, also known as \"Top Gun\". There, as the impulsive pilot competes with the best of the best, not only will he meet Charlie, the flying school's curvaceous astrophysics instructor, but also the brilliant and highly competitive fellow student, \"Iceman\", with whom right from the start, he will engage in a reckless contest. As Maverick is haunted by his father's mysterious death, will he be able to suppress his wild nature to win the prestigious Top Gun Trophy?",
                "16/May/1986",
                "Tom Cruise, Kelly McGillis, Val Kilmer",
                    false,
                "https://images-na.ssl-images-amazon.com/images/I/51GzFq7XaML._AC_.jpg"
            )
        )

        movies.add(
            MovieEntity(
                "m2",
                "Terminator 2 : Judgement Day",
                "Over 10 years have passed since the first machine called The Terminator tried to kill Sarah Connor and her unborn son, John. The man who will become the future leader of the human resistance against the Machines is now a healthy young boy. However, another Terminator, called the T-1000, is sent back through time by the supercomputer Skynet. This new Terminator is more advanced and more powerful than its predecessor and its mission is to kill John Connor when he's still a child. However, in the Internet and John do not have to face the threat of the T-1000 alone. Another Terminator (identical to the same model that tried and failed to kill Sarah Connor in 1984) is also sent back through time to protect them. Now, the battle for tomorrow has begun.",
                "03/July/1991",
                "Arnold Schwarzenegger, Sarah Hamilton, Robert Patrick",
                    false,
                "https://m.media-amazon.com/images/M/MV5BMGU2NzRmZjUtOGUxYS00ZjdjLWEwZWItY2NlM2JhNjkxNTFmXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UX182_CR0,0,182,268_AL_.jpg"
            )
        )

        movies.add(
            MovieEntity(
                "m3",
                "First Blood",
                "John J. Rambo is a former United States Special Forces soldier who fought in Vietnam and won the Congressional Medal of Honor, but his time in Vietnam still haunts him. As he came to Hope, Washington to visit a friend, he was guided out of town by the Sheriff William Teasel who insults Rambo, but what Teasel does not know that his insult angered Rambo to the point where Rambo became violent and was arrested. As he was at the county jail being cleaned, he escapes and goes on a rampage through the forest to try to escape from the sheriffs who want to kill him. Then, as Rambo's commanding officer, Colonel Samuel Trautman tries to save both the Sheriff's department and Rambo before the situation gets out of hand.",
                "02/October/1982",
                "Sylvester Stallone, Richard Crenna, Brian Dennehy",
                    false,
                "https://m.media-amazon.com/images/M/MV5BODBmOWU2YWMtZGUzZi00YzRhLWJjNDAtYTUwNWVkNDcyZmU5XkEyXkFqcGdeQXVyNDk3NzU2MTQ@._V1_UX182_CR0,0,182,268_AL_.jpg"
            )
        )
        movies.add(
            MovieEntity(
                "m4",
                "Back To The Future",
                "Marty McFly, a typical American teenager of the Eighties, is accidentally sent back to 1955 in a plutonium-powered DeLorean \"time machine\" invented by a slightly mad scientist. During his often hysterical, always amazing trip back in time, Marty must make certain his teenage parents-to-be meet and fall in love - so he can get back to the future.",
                "03/July/1985",
                "Michael J. Fox, Christopher Lloyd, Lea Thompson, Crispin Glover, Thomas F. Wilson",
                    false,
                "https://m.media-amazon.com/images/M/MV5BZmU0M2Y1OGUtZjIxNi00ZjBkLTg1MjgtOWIyNThiZWIwYjRiXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_UX182_CR0,0,182,268_AL_.jpg"
            )
        )
        movies.add(
            MovieEntity(
                "m5",
                "Back To The Future Part II",
                "Marty McFly has only just gotten back from the past, when he is once again picked up by Dr. Emmett Brown and sent through time to the future. Marty's job in the future is to pose as his own son to prevent him from being thrown in prison. Unfortunately, things get worse when the future changes the present.",
                "22/November/1989",
                "Michael J. Fox, Christopher Lloyd, Lea Thompson, Thomas F. Wilson",
                    false,
                "https://m.media-amazon.com/images/M/MV5BZTMxMGM5MjItNDJhNy00MWI2LWJlZWMtOWFhMjI5ZTQwMWM3XkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_UX182_CR0,0,182,268_AL_.jpg"
            )
        )
        movies.add(
            MovieEntity(
                "m6",
                "Back To The Future Part III",
                "Stranded in 1955, Marty McFly receives written word from his friend, Doctor Emmett Brown, as to where can be found the DeLorean time machine. However, an unfortunate discovery prompts Marty to go to his friend's aid. Using the time machine, Marty travels to the old west where his friend has run afoul of a gang of thugs and has fallen in love with a local schoolteacher. Using the technology from the time, Marty and Emmett devise one last chance to send the two of them back to the future.",
                "25/May/1990",
                "Michael J. Fox, Christopher Lloyd, Mary Steenburgen, Thomas F. Wilson",
                    false,
                "https://m.media-amazon.com/images/M/MV5BYjhlMGYxNmMtOWFmMi00Y2M2LWE5NWYtZTdlMDRlMGEzMDA3XkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_UX182_CR0,0,182,268_AL_.jpg"
            )
        )
        movies.add(
            MovieEntity(
                "m7",
                "Star Wars: Episode IV - A New Hope",
                "The Imperial Forces, under orders from cruel Darth Vader, hold Princess Leia hostage in their efforts to quell the rebellion against the Galactic Empire. Luke Skywalker and Han Solo, captain of the Millennium Falcon, work together with the companionable droid duo R2-D2 and C-3PO to rescue the beautiful princess, help the Rebel Alliance and restore freedom and justice to the Galaxy.",
                "25/May/1977",
                "Mark Hamill, Harrison Ford, Carrie Fisher, Alec Guinness, James Earl Jones",
                    false,
                "https://m.media-amazon.com/images/M/MV5BNzVlY2MwMjktM2E4OS00Y2Y3LWE3ZjctYzhkZGM3YzA1ZWM2XkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UX182_CR0,0,182,268_AL_.jpg"
            )
        )
        movies.add(
            MovieEntity(
                "m8",
                "Star Wars: Episode V - The Empire Strikes Back",
                "Luke Skywalker, Han Solo, Princess Leia and Chewbacca face attack by the Imperial forces and its AT-AT walkers on the ice planet Hoth. While Han and Leia escape in the Millennium Falcon, Luke travels to Dagobah in search of Yoda. Only with the Jedi Master's help will Luke survive when the Dark Side of the Force beckons him into the ultimate duel with Darth Vader.",
                "20/June/1980",
                "Mark Hamill, Harrison Ford, Carrie Fisher, James Earl Jones, Billy Dee Williams",
                    false,
                "https://m.media-amazon.com/images/M/MV5BYmU1NDRjNDgtMzhiMi00NjZmLTg5NGItZDNiZjU5NTU4OTE0XkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UX182_CR0,0,182,268_AL_.jpg"
            )
        )
        movies.add(
            MovieEntity(
                "m9",
                "Star Wars: Episode VI - Return Of The Jedi",
                "Luke Skywalker battles Jabba the Hutt and Darth Vader to save his comrades in the Rebel Alliance and triumph over the Galactic Empire. Han Solo and Princess Leia reaffirm their love, and team with Chewbacca, Lando Calrissian, the Ewoks, and droids C-3PO and R2-D2 to aid in the disruption of the Dark Side, and the defeat of the evil emperor.",
                "25/May/1983",
                "Mark Hamill, Harrison Ford, Carrie Fisher, James Earl Jones, Billy Dee Williams",
                    false,
                "https://m.media-amazon.com/images/M/MV5BOWZlMjFiYzgtMTUzNC00Y2IzLTk1NTMtZmNhMTczNTk0ODk1XkEyXkFqcGdeQXVyNTAyODkwOQ@@._V1_UX182_CR0,0,182,268_AL_.jpg"
            )
        )
        movies.add(
            MovieEntity(
                "m10",
                "Full Metal Jacket",
                "A two-segment look at the effect of the military mindset and war itself on Vietnam era Marines. The first half follows a group of recruits in boot camp under the command of the punishing Gunnery Sergeant Hartman. The second half shows one of those recruits, Joker, covering the war as a correspondent for Stars and Stripes, focusing on the Tet offensive.",
                "10/July/1987",
                "Matthew Modine, Adam Baldwin, Vincent D'Onofrio, R. Lee Ermey, Dorian Harewood",
                    false,
                "https://m.media-amazon.com/images/M/MV5BNzkxODk0NjEtYjc4Mi00ZDI0LTgyYjEtYzc1NDkxY2YzYTgyXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UX182_CR0,0,182,268_AL_.jpg"
            )
        )
        return movies
    }



    fun generateRemoteDummyMovies(): List<MoviesResponse>{

        val movies = ArrayList<MoviesResponse>()

        movies.add(
                MoviesResponse(
                        "m1",
                        "Top Gun",
                        "Code-named \"Maverick\", Pete Mitchell, the impetuous daredevil Navy-pilot ace, is accepted into Miramar's elite Fighter School, also known as \"Top Gun\". There, as the impulsive pilot competes with the best of the best, not only will he meet Charlie, the flying school's curvaceous astrophysics instructor, but also the brilliant and highly competitive fellow student, \"Iceman\", with whom right from the start, he will engage in a reckless contest. As Maverick is haunted by his father's mysterious death, will he be able to suppress his wild nature to win the prestigious Top Gun Trophy?",
                        "16/May/1986",
                        "Tom Cruise, Kelly McGillis, Val Kilmer",
                        "https://images-na.ssl-images-amazon.com/images/I/51GzFq7XaML._AC_.jpg"
                )
        )

        movies.add(
                MoviesResponse(
                        "m2",
                        "Terminator 2 : Judgement Day",
                        "Over 10 years have passed since the first machine called The Terminator tried to kill Sarah Connor and her unborn son, John. The man who will become the future leader of the human resistance against the Machines is now a healthy young boy. However, another Terminator, called the T-1000, is sent back through time by the supercomputer Skynet. This new Terminator is more advanced and more powerful than its predecessor and its mission is to kill John Connor when he's still a child. However, in the Internet and John do not have to face the threat of the T-1000 alone. Another Terminator (identical to the same model that tried and failed to kill Sarah Connor in 1984) is also sent back through time to protect them. Now, the battle for tomorrow has begun.",
                        "03/July/1991",
                        "Arnold Schwarzenegger, Sarah Hamilton, Robert Patrick",
                        "https://m.media-amazon.com/images/M/MV5BMGU2NzRmZjUtOGUxYS00ZjdjLWEwZWItY2NlM2JhNjkxNTFmXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UX182_CR0,0,182,268_AL_.jpg"
                )
        )

        movies.add(
                MoviesResponse(
                        "m3",
                        "First Blood",
                        "John J. Rambo is a former United States Special Forces soldier who fought in Vietnam and won the Congressional Medal of Honor, but his time in Vietnam still haunts him. As he came to Hope, Washington to visit a friend, he was guided out of town by the Sheriff William Teasel who insults Rambo, but what Teasel does not know that his insult angered Rambo to the point where Rambo became violent and was arrested. As he was at the county jail being cleaned, he escapes and goes on a rampage through the forest to try to escape from the sheriffs who want to kill him. Then, as Rambo's commanding officer, Colonel Samuel Trautman tries to save both the Sheriff's department and Rambo before the situation gets out of hand.",
                        "02/October/1982",
                        "Sylvester Stallone, Richard Crenna, Brian Dennehy",
                        "https://m.media-amazon.com/images/M/MV5BODBmOWU2YWMtZGUzZi00YzRhLWJjNDAtYTUwNWVkNDcyZmU5XkEyXkFqcGdeQXVyNDk3NzU2MTQ@._V1_UX182_CR0,0,182,268_AL_.jpg"
                )
        )
        movies.add(
                MoviesResponse(
                        "m4",
                        "Back To The Future",
                        "Marty McFly, a typical American teenager of the Eighties, is accidentally sent back to 1955 in a plutonium-powered DeLorean \"time machine\" invented by a slightly mad scientist. During his often hysterical, always amazing trip back in time, Marty must make certain his teenage parents-to-be meet and fall in love - so he can get back to the future.",
                        "03/July/1985",
                        "Michael J. Fox, Christopher Lloyd, Lea Thompson, Crispin Glover, Thomas F. Wilson",
                        "https://m.media-amazon.com/images/M/MV5BZmU0M2Y1OGUtZjIxNi00ZjBkLTg1MjgtOWIyNThiZWIwYjRiXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_UX182_CR0,0,182,268_AL_.jpg"
                )
        )
        movies.add(
                MoviesResponse(
                        "m5",
                        "Back To The Future Part II",
                        "Marty McFly has only just gotten back from the past, when he is once again picked up by Dr. Emmett Brown and sent through time to the future. Marty's job in the future is to pose as his own son to prevent him from being thrown in prison. Unfortunately, things get worse when the future changes the present.",
                        "22/November/1989",
                        "Michael J. Fox, Christopher Lloyd, Lea Thompson, Thomas F. Wilson",
                        "https://m.media-amazon.com/images/M/MV5BZTMxMGM5MjItNDJhNy00MWI2LWJlZWMtOWFhMjI5ZTQwMWM3XkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_UX182_CR0,0,182,268_AL_.jpg"
                )
        )
        movies.add(
                MoviesResponse(
                        "m6",
                        "Back To The Future Part III",
                        "Stranded in 1955, Marty McFly receives written word from his friend, Doctor Emmett Brown, as to where can be found the DeLorean time machine. However, an unfortunate discovery prompts Marty to go to his friend's aid. Using the time machine, Marty travels to the old west where his friend has run afoul of a gang of thugs and has fallen in love with a local schoolteacher. Using the technology from the time, Marty and Emmett devise one last chance to send the two of them back to the future.",
                        "25/May/1990",
                        "Michael J. Fox, Christopher Lloyd, Mary Steenburgen, Thomas F. Wilson",
                        "https://m.media-amazon.com/images/M/MV5BYjhlMGYxNmMtOWFmMi00Y2M2LWE5NWYtZTdlMDRlMGEzMDA3XkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_UX182_CR0,0,182,268_AL_.jpg"
                )
        )
        movies.add(
                MoviesResponse(
                        "m7",
                        "Star Wars: Episode IV - A New Hope",
                        "The Imperial Forces, under orders from cruel Darth Vader, hold Princess Leia hostage in their efforts to quell the rebellion against the Galactic Empire. Luke Skywalker and Han Solo, captain of the Millennium Falcon, work together with the companionable droid duo R2-D2 and C-3PO to rescue the beautiful princess, help the Rebel Alliance and restore freedom and justice to the Galaxy.",
                        "25/May/1977",
                        "Mark Hamill, Harrison Ford, Carrie Fisher, Alec Guinness, James Earl Jones",
                        "https://m.media-amazon.com/images/M/MV5BNzVlY2MwMjktM2E4OS00Y2Y3LWE3ZjctYzhkZGM3YzA1ZWM2XkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UX182_CR0,0,182,268_AL_.jpg"
                )
        )
        movies.add(
                MoviesResponse(
                        "m8",
                        "Star Wars: Episode V - The Empire Strikes Back",
                        "Luke Skywalker, Han Solo, Princess Leia and Chewbacca face attack by the Imperial forces and its AT-AT walkers on the ice planet Hoth. While Han and Leia escape in the Millennium Falcon, Luke travels to Dagobah in search of Yoda. Only with the Jedi Master's help will Luke survive when the Dark Side of the Force beckons him into the ultimate duel with Darth Vader.",
                        "20/June/1980",
                        "Mark Hamill, Harrison Ford, Carrie Fisher, James Earl Jones, Billy Dee Williams",
                        "https://m.media-amazon.com/images/M/MV5BYmU1NDRjNDgtMzhiMi00NjZmLTg5NGItZDNiZjU5NTU4OTE0XkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UX182_CR0,0,182,268_AL_.jpg"
                )
        )
        movies.add(
                MoviesResponse(
                        "m9",
                        "Star Wars: Episode VI - Return Of The Jedi",
                        "Luke Skywalker battles Jabba the Hutt and Darth Vader to save his comrades in the Rebel Alliance and triumph over the Galactic Empire. Han Solo and Princess Leia reaffirm their love, and team with Chewbacca, Lando Calrissian, the Ewoks, and droids C-3PO and R2-D2 to aid in the disruption of the Dark Side, and the defeat of the evil emperor.",
                        "25/May/1983",
                        "Mark Hamill, Harrison Ford, Carrie Fisher, James Earl Jones, Billy Dee Williams",
                        "https://m.media-amazon.com/images/M/MV5BOWZlMjFiYzgtMTUzNC00Y2IzLTk1NTMtZmNhMTczNTk0ODk1XkEyXkFqcGdeQXVyNTAyODkwOQ@@._V1_UX182_CR0,0,182,268_AL_.jpg"
                )
        )
        movies.add(
                MoviesResponse(
                        "m10",
                        "Full Metal Jacket",
                        "A two-segment look at the effect of the military mindset and war itself on Vietnam era Marines. The first half follows a group of recruits in boot camp under the command of the punishing Gunnery Sergeant Hartman. The second half shows one of those recruits, Joker, covering the war as a correspondent for Stars and Stripes, focusing on the Tet offensive.",
                        "10/July/1987",
                        "Matthew Modine, Adam Baldwin, Vincent D'Onofrio, R. Lee Ermey, Dorian Harewood",
                        "https://m.media-amazon.com/images/M/MV5BNzkxODk0NjEtYjc4Mi00ZDI0LTgyYjEtYzc1NDkxY2YzYTgyXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UX182_CR0,0,182,268_AL_.jpg"
                )
        )
        return movies
    }



}