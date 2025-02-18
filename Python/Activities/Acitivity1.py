from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/")
    print("page title:" , driver.title)

    driver.find_element(By.LINK_TEXT, "About Us").click()

    print("New page title is: ", driver.title)