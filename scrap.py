import requests
from bs4 import BeautifulSoup
url = "https://www.w3schools.com/html/"

response = requests.get(url)

soup = BeautifulSoup(response.text, 'html.parser')

tutorial_links = soup.select("a.w3-bar-item.w3-button")

print("HTML Tutorial Titles on W3Schools:")
for link in tutorial_links:
    title = link.text.strip()  # Get the text of the link and strip any extra whitespace
    print(title)
