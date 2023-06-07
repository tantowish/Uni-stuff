from fpdf import FPDF

# Custom PDF class
class ReceiptPDF(FPDF):
    def __init__(self, page_width, page_height):
        super().__init__()
        self.page_width = page_width
        self.page_height = page_height
    def header(self):
        self.set_font("Arial", "B", 12)
        self.cell(0, 10, "Wishlist Receipt", ln=True, align="C")

    def footer(self):
        self.set_y(-15)
        self.set_font("Arial", "I", 8)
        self.cell(0, 10, "Page %s" % self.page_no(), 0, 0, "C")

    def chapter_title(self, title):
        self.set_font("Arial", "B", 14)
        self.cell(0, 10, title, ln=True, align="L")
        self.ln(5)

    def chapter_body(self, text):
        self.set_font("Arial", "", 12)
        self.multi_cell(0, 10, text)
        self.ln(5)