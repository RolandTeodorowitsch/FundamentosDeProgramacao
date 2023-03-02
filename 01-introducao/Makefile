PDF =	\
	pucrs-ep-fprog-unidade_01-introducao-autodromo_desafios.pdf \
	pucrs-ep-fprog-unidade_01-introducao-laminas.pdf

all:	$(PDF)

%.pdf:	%.tex
	@pdflatex -shell-escape $<
	@pdflatex -shell-escape $<

clean:
	@rm -f *~ *.pyg *.log *.out *.aux *.toc *.nav *.snm *.vrb
	@rm -rf _minted-*
