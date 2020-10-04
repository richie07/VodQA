
 Feature: Como usuario deseo ver el carrusel
   Background:Login Sucessfull
     Given  Usuario enter "admin"
     And  enter "admin"
     When tap log in
     Then Validation succesfull

   @carrusel
   Scenario: Validate Element Carousel
     Given User scroll "Carousel"
     When select tap
     Then validate elemento "1"