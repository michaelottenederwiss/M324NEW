import { render, screen } from '@testing-library/react';
import App from './App';

test('renders input field and submit button', () => {
  render(<App />)
  
  // Statt Label: einfachstes mögliches Matching
  expect(screen.getByRole('textbox')).toBeInTheDocument()
  
  // Button mit Name 'Absenden'
  expect(screen.getByRole('button', { name: /absenden/i })).toBeInTheDocument()
})
